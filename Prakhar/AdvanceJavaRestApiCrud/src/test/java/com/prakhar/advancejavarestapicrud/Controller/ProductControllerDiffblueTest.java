package com.prakhar.advancejavarestapicrud.Controller;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.prakhar.advancejavarestapicrud.Entity.Product;
import com.prakhar.advancejavarestapicrud.Service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

class ProductControllerDiffblueTest {
    /**
     * Method under test: {@link ProductController#getProductById(int)}
     */
    @Test
    void testGetProductById() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.test.web.servlet.RequestBuilder.buildRequest(jakarta.servlet.ServletContext)" because "requestBuilder" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ProductService productSer = mock(ProductService.class);
        when(productSer.getProductById(anyInt())).thenReturn(null);
        ResponseEntity<Product> actualProductById = (new ProductController(productSer)).getProductById(1);
        verify(productSer).getProductById(anyInt());
        assertNull(actualProductById);
    }

    /**
     * Method under test: {@link ProductController#deleteProduct(int)}
     */
    @Test
    void testDeleteProduct() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.test.web.servlet.RequestBuilder.buildRequest(jakarta.servlet.ServletContext)" because "requestBuilder" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ProductService productSer = mock(ProductService.class);
        when(productSer.deleteProduct(anyInt())).thenReturn(null);
        ResponseEntity<Void> actualDeleteProductResult = (new ProductController(productSer)).deleteProduct(1);
        verify(productSer).deleteProduct(anyInt());
        assertNull(actualDeleteProductResult);
    }
}

