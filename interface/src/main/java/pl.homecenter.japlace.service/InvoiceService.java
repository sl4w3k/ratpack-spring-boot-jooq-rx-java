package pl.homecenter.japlace.service;

import pl.homecenter.japlace.dao.Invoice;

import java.util.List;

/**
 * created by s.wieczorek
 */
public interface InvoiceService {

    List<Invoice> getAllInvoices() throws InterruptedException;

}