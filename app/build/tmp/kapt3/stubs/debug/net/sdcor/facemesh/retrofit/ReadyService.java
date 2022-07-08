package net.sdcor.facemesh.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\'JJ\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\fH\'\u00a8\u0006\u0010"}, d2 = {"Lnet/sdcor/facemesh/retrofit/ReadyService;", "", "measure", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "CompanyCode", "", "CompanyKey", "CompanyClient", "date", "data", "START_IDX", "", "select_result", "Option", "LAST_IDX", "app_debug"})
public abstract interface ReadyService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/measure")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<okhttp3.ResponseBody> measure(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "CompanyCode")
    java.lang.String CompanyCode, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "CompanyKey")
    java.lang.String CompanyKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "CompanyClient")
    java.lang.String CompanyClient, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "date")
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "data")
    java.lang.String data, @retrofit2.http.Field(value = "START_IDX")
    int START_IDX);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/select_result")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<okhttp3.ResponseBody> select_result(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "CompanyCode")
    java.lang.String CompanyCode, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "CompanyKey")
    java.lang.String CompanyKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "CompanyClient")
    java.lang.String CompanyClient, @retrofit2.http.Field(value = "Option")
    int Option, @retrofit2.http.Field(value = "START_IDX")
    int START_IDX, @retrofit2.http.Field(value = "LAST_IDX")
    int LAST_IDX);
}