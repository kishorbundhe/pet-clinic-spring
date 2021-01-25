package com.petclinicspring.com.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService<T, ID> {

  protected Map<ID, T> map = new HashMap<>();

  public Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  T findById(ID id) {

    return map.get(id);
  }
  
  T save(ID id, T object){
	   map.put(id, object);
	   return object;
  }
   public void delete(T object) {
	   map.entrySet().removeIf(entry ->entry.equals(object));
	  
   }
  
   public void deleteById(ID id) {
	   map.remove(id);
   }
}
