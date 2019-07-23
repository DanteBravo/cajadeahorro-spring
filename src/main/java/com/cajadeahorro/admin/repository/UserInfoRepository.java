package com.cajadeahorro.admin.repository;

import com.cajadeahorro.admin.models.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {
}
