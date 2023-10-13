// Test generated by RoostGPT for test testJavaParserAst using AI Type Open AI and AI Model gpt-4

package com.wishop.admin.configurations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DatabaseConfig_prodDatabaseConnection_53afd19e1a_Test {

    @InjectMocks
    private DatabaseConfig databaseConfig;

    @Mock
    private DriverManagerDataSource driverManagerDataSource;

    @BeforeEach
    public void setUp() {
        when(driverManagerDataSource.getDriverClassName()).thenReturn("com.mysql.jdbc.Driver");
        when(driverManagerDataSource.getUrl()).thenReturn("jdbc:mysql://localhost:3306/test");
    }

    @Test
    public void testProdDatabaseConnection() {
        String expected = "DB Connection to RDS_PROD - High Performance Instance";
        String actual = databaseConfig.prodDatabaseConnection();
        assertEquals(expected, actual);
    }

    @Test
    public void testProdDatabaseConnection_Failure() {
        when(driverManagerDataSource.getDriverClassName()).thenReturn(null);
        when(driverManagerDataSource.getUrl()).thenReturn(null);
        String expected = "DB Connection to RDS_PROD - High Performance Instance";
        String actual = databaseConfig.prodDatabaseConnection();
        assertEquals(expected, actual);
    }
}
