package pl.homecenter.japlace.handlers;

import pl.homecenter.japlace.dao.Invoice;
import pl.homecenter.japlace.service.InvoiceService;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.rx.RxRatpack;
import rx.Observable;

import java.util.List;

import static ratpack.jackson.Jackson.json;

/**
 * @author s.wieczorek
 */
public class InvoiceServiceHandler implements Handler {

    @Override
    public void handle(Context context) throws Exception {
        InvoiceService invoiceService = context.get(InvoiceService.class);
        Observable<List<Invoice>> allInvoicesRx = Observable.just(invoiceService.getAllInvoices());
        RxRatpack.promise(allInvoicesRx).then(response -> context.render(json(response)));
    }
}

