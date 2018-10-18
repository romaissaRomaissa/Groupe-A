package org.mql.platform.dao;

import org.mql.platform.models.User;

public interface UserDao {

  User findOne(int id);
}
