package com.zensar.broker.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.zensar.broker.dao.BrokerDao;
import com.zensar.broker.dto.PaymentDTO;
import java.time.LocalDate;


@Repository
public class BrokerDaoImpl implements BrokerDao {

	

	@Override
	public List<PaymentDTO> getPaymentDetails() {
		List<PaymentDTO> paymentDTOList = new ArrayList<PaymentDTO>();
		
		

		PaymentDTO paymentDTO = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"shakir_35346347643","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		PaymentDTO paymentDTO1 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"pqrds_35346347643","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		PaymentDTO paymentDTO2 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		PaymentDTO paymentDTO3 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		PaymentDTO paymentDTO4 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		
		PaymentDTO paymentDTO5 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		
		PaymentDTO paymentDTO6 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		
		PaymentDTO paymentDTO7 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		
		PaymentDTO paymentDTO8 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		PaymentDTO paymentDTO9 = new PaymentDTO(new Long(2228235),LocalDate.of(2019, 11, 4),LocalDate.of(2019, 11, 4),"teryer","00-000047-7",1.00d,"ZAR",1,"Awaiting Customer Audit");
		
		
		
		paymentDTOList.add(paymentDTO);
		paymentDTOList.add(paymentDTO1);
		paymentDTOList.add(paymentDTO2);
		
		paymentDTOList.add(paymentDTO3);
		paymentDTOList.add(paymentDTO4);
		paymentDTOList.add(paymentDTO5);
		paymentDTOList.add(paymentDTO6);
		paymentDTOList.add(paymentDTO7);
		paymentDTOList.add(paymentDTO8);
		paymentDTOList.add(paymentDTO9);

		return paymentDTOList;

	}
	
	
}
