package org.jungle.proxy;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.util.ssl.SslContextFactory;

public class JettySocks5ProxyTest {
    
    public static void main(String[] args) throws Exception {
        
        SslContextFactory sslContextFactory = new SslContextFactory.Client();
        HttpClient httpClient = new HttpClient(sslContextFactory);
        // connect socks5
        // ProxyConfiguration proxyConfig = httpClient.getProxyConfiguration();
        // proxyConfig.getProxies().add(new JettySocks5Proxy("127.0.0.1", 7890));

        httpClient.start();

        ContentResponse response = httpClient.GET("https://ifconfig.co/json");
        System.out.println(response.getContentAsString());
    }
}
