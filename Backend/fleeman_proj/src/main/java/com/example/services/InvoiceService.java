package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Pdf_demo;
import com.example.repository.InvoiceRepository;

@Service
public class InvoiceService {

    @Autowired
  private  InvoiceRepository invoicerepo;

    
    public Optional<Pdf_demo> SaveDetails(Pdf_demo pdfdemo) {
    	
    	invoicerepo.save(pdfdemo);
		return null;
    }
   public Optional<Pdf_demo> GetDetails(int Invoice_id) {
    	
	     return invoicerepo.findById(Invoice_id);
    	//return Optional.ofNullable(invoicerepo.getById(Invoice_id));
    }
}