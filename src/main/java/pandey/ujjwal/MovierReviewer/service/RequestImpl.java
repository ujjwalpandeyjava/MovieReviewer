package pandey.ujjwal.MovierReviewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import pandey.ujjwal.MovierReviewer.pojo.RequestedTitle;

@Service
public class RequestImpl implements RequestService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public RequestedTitle saveNewRequest(RequestedTitle newToSave) {
		return mongoTemplate.save(newToSave);
	}
}