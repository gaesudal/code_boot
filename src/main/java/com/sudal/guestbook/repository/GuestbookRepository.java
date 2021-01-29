package com.sudal.guestbook.repository;

import com.sudal.guestbook.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long> , QuerydslPredicateExecutor<Guestbook> {
}
