package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.IDataCollectionService;

@RestController
public class DCRestController {
	@Autowired
	private IDataCollectionService service;
}
