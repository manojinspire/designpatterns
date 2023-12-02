package Adapter;

import Adapter.ThirdParties.CanaraBankApi;

public class CanaraBankApiAdapter implements  BankAdapter{

    CanaraBankApi canaraBankApi = new CanaraBankApi();


    // it is a adapter between interface and canarabank. we can override bank methods using canarabank api
}
