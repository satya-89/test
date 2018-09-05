package com.mitoconnect.pe;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "*" }, maxAge = 4800, allowCredentials = "false")

public class ABC {

	@RequestMapping(value = "/api/v1/orders/current", method = RequestMethod.GET)
	public String getAllReports7(final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		return "";
	}
	
	@RequestMapping(value = "/api/v1/users/154", method = RequestMethod.GET)
	public ResponseEntity<String> getAllReports13(final HttpServletRequest request, final HttpServletResponse response, @RequestParam String order_token) throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource;
		resource = new ClassPathResource("12");

		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return new ResponseEntity(content, HttpStatus.OK);
	//	return content;
	}

	
	
	@RequestMapping(value = "/auth/accounts", method = RequestMethod.POST)
	public ResponseEntity<String> getAllReports12(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource;
		resource = new ClassPathResource("11");

		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return new ResponseEntity(content, HttpStatus.OK);
	//	return content;
	}

	
	
	
	@RequestMapping(value = "/api/v1/checkouts/R541513946/next.json", method = RequestMethod.PUT)
	public ResponseEntity<String> getAllReports11(final HttpServletRequest request, final HttpServletResponse response, @RequestParam String order_token) throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource;
		resource = new ClassPathResource("10");

		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return new ResponseEntity(content, HttpStatus.OK);
	//	return content;
	}
	


	@RequestMapping(value = "/api/v1/orders/R541513946/line_items", method = RequestMethod.POST)
	public ResponseEntity<String> getAllReports8(final HttpServletRequest request, final HttpServletResponse response, @RequestParam String order_token) throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource;
		resource = new ClassPathResource("9");

		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return new ResponseEntity(content, HttpStatus.CREATED);
	//	return content;
	}


	@RequestMapping(value = "/api/v1/orders/null/line_items", method = RequestMethod.POST)
	public ResponseEntity<String> getAllReports9(final HttpServletRequest request, final HttpServletResponse response, @RequestParam String order_token) throws Exception {
		return getAllReports8(request, response,order_token);
	}

	@RequestMapping(value = "/api/v1/orders.json", method = RequestMethod.POST)
	public String getAllReports6(final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource;
		resource = new ClassPathResource("8");

		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return content;
	}

	@RequestMapping(value = "/api/v1/products/ekebol-wooden-steal", method = RequestMethod.GET)
	public String getAllReports5(final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource;
		resource = new ClassPathResource("7");

		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return content;
	}

	/// api/v1/taxonomies?q[name_cont]=Today%27s%20Deals&set=nested&per_page=2
	@RequestMapping(value = "/api/v1/taxonomies", method = RequestMethod.GET)
	public String getAllReports4(final HttpServletRequest request, final HttpServletResponse response,
			@RequestParam(value = "q", defaultValue = "test") final String q,
			@RequestParam(value = "set", defaultValue = "nested") final String set,
			@RequestParam(value = "per_page", defaultValue = "2") final String per_page) throws Exception {
		
		Resource resource;
		if (q.equalsIgnoreCase("Brands"))
			resource = new ClassPathResource("5");

		if (q.equalsIgnoreCase("Today's Deals"))
			resource = new ClassPathResource("6");

		else

			resource = new ClassPathResource("4");

		System.out.println(q);

		File file = resource.getFile();
		String content = "";
		try {
			byte[] bdata = FileCopyUtils.copyToByteArray(resource.getInputStream());
		
			content = new String(bdata, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return content;
	}

	/// api/v1/orders/R723581444/line_items

	@RequestMapping(value = "/api/v1/products", method = RequestMethod.GET)
	public String getAllReports3(final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource = new ClassPathResource("3");
		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return content;
	}

	@RequestMapping(value = "/api/v1/taxons/products", method = RequestMethod.GET)
	public String getAllReports2(final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource = new ClassPathResource("2");
		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return content;
	}

	@RequestMapping(value = "/favorite_products.json", method = RequestMethod.GET)
	public String getAllReports(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();

		Resource resource = new ClassPathResource("1");
		File file = resource.getFile();
		String content = "";
		try {
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Exception in load template " + e);
		}
		return content;
	}
}
