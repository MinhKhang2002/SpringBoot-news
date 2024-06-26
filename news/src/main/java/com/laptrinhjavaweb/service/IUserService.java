package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {
    void saveUser(UserDTO userDTO);
    UserDTO getUserById(Long userId);

    boolean existsByUsername1(String username);

    Long addUser(UserDTO userDTO, String loggedInUser, Long roleId);
    void addUserRole(Long userId, Long roleId);
//    UserEntity getUserByUsernameAndPassword(String username, String password);
    List<UserDTO> getAllUser();
    List<UserDTO> findAll(Pageable pageable);
    int totalItem();
    void deleteUser(long[] id);
    void updateUser(long id,UserDTO userDTO,long roleId) throws Exception;
}
