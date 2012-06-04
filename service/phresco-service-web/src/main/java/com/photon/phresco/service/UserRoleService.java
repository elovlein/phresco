package com.photon.phresco.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.photon.phresco.exception.PhrescoException;
import com.photon.phresco.model.User;
import com.photon.phresco.model.Users;


@Path("/userrole")
public class UserRoleService {
	private static Users users;
	private static File file;

	private void init() throws JAXBException {
		InputStream file = UserRoleService.class.getClassLoader().getResourceAsStream("UserRoleMapping.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		users = (Users) jaxbUnmarshaller.unmarshal(file);
		System.out.println(users);
	}
	
	@POST 
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addUserRoles(User user) throws PhrescoException {
		try {
			init();
			List<User> userList = users.getUsers();
			userList.add(user);
			users.setUsers(userList);
			save();
		} catch (JAXBException e) {
			throw new PhrescoException(e);
		}
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public void editUserRoles(User user) throws PhrescoException {
		try {
			init();
			List<User> userList = users.getUsers();
			for (User userObj : userList) {
				if (userObj.getId().equals(user.getId())) {
					userObj.setRoles(user.getRoles());
					break;
				}
			}
			save();
		} catch (JAXBException e) {
			throw new PhrescoException(e);
		}
	}
	
	@POST
	@Path("/delete")
	@Produces({ MediaType.APPLICATION_JSON })
	public static void deleteUserRoles(String userId, List<String> roles) throws JAXBException {
		//TODO
	}

	private void save() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
		Marshaller marshal = jaxbContext.createMarshaller();
		marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshal.marshal(users, file);
	}
}
