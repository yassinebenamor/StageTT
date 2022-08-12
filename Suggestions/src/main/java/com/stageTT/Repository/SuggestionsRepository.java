package com.stageTT.Repository;

import com.stageTT.Entity.Suggestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuggestionsRepository extends JpaRepository<Suggestions,Integer> {
    @Query("SELECT s FROM Suggestions s WHERE s.category = ?1")
    List<Suggestions> findSuggestionsByCategory(String category);
}
