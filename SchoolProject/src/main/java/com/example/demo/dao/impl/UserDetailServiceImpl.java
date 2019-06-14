/*
 * package com.example.demo.dao.impl;
 * 
 * import java.util.Collection;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.AuthorityUtils; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * 
 * import com.example.demo.Model.User; import
 * com.example.demo.dao.UserDetailService; import
 * com.example.demo.repository.UserRepository;
 * 
 * public class UserDetailServiceImpl implements UserDetailService {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Override public User loadUserByUsername(String userName) throws
 * UsernameNotFoundException { User user = userRepository.findByEmail(userName)
 * .orElseThrow(()-> new UsernameNotFoundException("email" + userName +
 * "not found"));
 * 
 * return new User(user.getEmail(),user.getPassword(), getAuthorities(user));
 * 
 * }
 * 
 * private static Collection<? extends GrantedAuthority> getAuthorities (User
 * user){ String []userRole = user.getRoles().stream().map((role)->
 * role.getName()).toArray(String []::new); Collection<GrantedAuthority>
 * authorities = AuthorityUtils.createAuthorityList(userRole);
 * 
 * return authorities; } }
 */