package catalog.service.impl;

import catalog.bean.News;
import catalog.dao.NewsDAO;
import catalog.dao.exception.DAOException;
import catalog.dao.impl.DAOFactory;
import catalog.service.CatalogService;
import catalog.service.exception.ServiceException;

public class CatalogServiceImpl implements CatalogService {
	
	@Override
	public String addNews(News news) throws ServiceException {
	// !!! ������ �������� ����� ���������� ���� �������� ����� ����������� ��������� �������� ��������� (��� �� � ��� �� �� ���� ��� �� �����)!
		String response = null;
		try {
		DAOFactory daoObjectFactory = DAOFactory.getInstance(); 
		NewsDAO newsDAO = daoObjectFactory.getNewsDAO(); 
		response = newsDAO.addNews(news);
		} catch (DAOException e) {
			response = "error in addNews CatalogService, item not added";
			throw new ServiceException(e);
		}
		return response;
	}
	
	@Override
	public String searchNews(String keyword) throws ServiceException {
		// !!! ������ �������� ����� ���������� ���� �������� ����� ����������� ��������� �������� ��������� (��� �� � ��� �� �� ���� ��� �� �����)!
		String response = null;
		try {
		DAOFactory daoObjectFactory = DAOFactory.getInstance(); 
		NewsDAO newsDAO = daoObjectFactory.getNewsDAO(); 
		response = newsDAO.searchNews(keyword);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return response;
	}

}
