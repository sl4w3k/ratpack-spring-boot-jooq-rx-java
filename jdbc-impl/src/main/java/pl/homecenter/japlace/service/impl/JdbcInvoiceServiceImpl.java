package pl.homecenter.japlace.service.impl;

import org.springframework.stereotype.Service;
import pl.homecenter.japlace.dao.Invoice;
import pl.homecenter.japlace.service.InvoiceService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author s.wieczorek
 */
@Service
public class JdbcInvoiceServiceImpl implements InvoiceService {

    private List<Invoice> invoices;

    public JdbcInvoiceServiceImpl() {
        Invoice invoice = new Invoice();
        invoice.setId("id");
        invoice.setValue((new Random().nextDouble()));
        invoice.setNumber(UUID.randomUUID().toString());
        invoices = Arrays.asList(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() throws InterruptedException {
        System.out.println("get all invoices non reactive");
        TimeUnit.SECONDS.sleep(1);
        return invoices;
    }

//    @Override
//    public Observable<List<Invoice>> getAllInvoicesRx() {
//        return Observable.fromCallable(() -> getAllInvoices());
//    }

}
