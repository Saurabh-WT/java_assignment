package com.prakhar.security.repository;

import com.prakhar.security.model.BookHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookHistoryRepository extends JpaRepository<BookHistory,Long> {
}
