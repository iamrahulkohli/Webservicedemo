package com.example.demo.converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.demo.service.USER_DETAILS;
import com.example.demo.service.USER_DETAILSFORM;

public class UserDetailsConversion implements Converter<USER_DETAILS, USER_DETAILSFORM>{

	@Override
	public USER_DETAILSFORM convert(USER_DETAILS user_details) {
		USER_DETAILSFORM detailsform=new USER_DETAILSFORM();
		detailsform.setUSER_UID(user_details.getUSER_UID());
		detailsform.setUSER_NAME(user_details.getUSER_NAME());
		detailsform.setPASS(user_details.getPASS());
		return detailsform;
	}

}
