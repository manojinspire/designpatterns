package Adapter;

import Adapter.ThirdParties.YesBankApi;

public class YesBankApiAdapter implements BankAdapter{

    YesBankApi yesBankApi = new YesBankApi() ;
}
