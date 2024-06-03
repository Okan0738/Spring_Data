package com.okan.repository;

import com.okan.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long > {

    List<Course> findByCategory(String category);

    List<Course> findByCategoryOrderByName(String category);

    boolean existsByName(String name);

    int countByCategory(String category);

    List<Course> findByNameStartingWith(String name);

    Stream<Course> streamAllByCategory(String category);



    @Query("SELECT c FROM Course c WHERE c.category = :category AND c.rating > :rating")
    List<Course> retrieveAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating);



}
