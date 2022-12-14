package com.teonas.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teonas.hrpayroll.entities.Payment;
import com.teonas.hrpayroll.entities.Worker;
import com.teonas.hrpayroll.feingclients.WorkerFeingClient;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeingClient workerFeingClient;

    public Payment getPayment(long workerId, int days) {
        
        Worker worker = workerFeingClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
    
}
