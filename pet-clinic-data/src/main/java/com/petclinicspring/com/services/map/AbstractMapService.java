package com.petclinicspring.com.services.map;

import com.petclinicspring.com.models.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {

        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));

    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long nextId= null;
        try {
           nextId=Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }
}
