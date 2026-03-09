package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.User;
import com.Repository.UserRepository;
import com.dto.userdto;

@Service
public class UserService {
	@Autowired
	UserRepository uresp;
	
	public String registration(User u)
	{
	    if(uresp.findByUsername(u.getUsername())!=null)
	    {
	        return "username already exists";
	    }

	    if(uresp.findByEmail(u.getEmail())!=null)
	    {
	        return "email already exists";
	    }

	    if(uresp.findByContactno(u.getContactno())!=null)
	    {
	        return "mobile already exists";
	    }

	    uresp.save(u);
	    return "user registered successfully";
	}

	public User login(userdto dto)
	{
		User existinguser=uresp.findByUsername(dto.getUsername());
		if(existinguser==null)
		{
			return null;
		}
		else
		{
			if(existinguser.getPassword().equals(dto.getPassword()))
					{
				return existinguser;
					}
			else
			{
				return null;
			}
		}
	}

}
