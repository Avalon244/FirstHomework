package MockitoTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

	@Before
	public void setUp() throws Exception {
	}
	Bank bank = new Bank();
	User usr = mock(User.class);
	MoneyChange money = mock(MoneyChange.class);
	
	@Test
	public void testShowUser() {
		when(usr.getName()).thenReturn("测试员"); 
		when(usr.getAddress()).thenReturn("测试地址");
		when(usr.getBalance()).thenReturn(100.0);
		bank.UserSet(usr, money);
		bank.ShowUser();
	}

	@Test
	public void testDepositMoney() {
		when(money.depositeMoney(100.0, 20.0)).thenReturn(120.0);
		bank.UserSet(usr, money);
		Assert.assertEquals((double)bank.depositMoney(20.0),120.0);
	}

	@Test
	public void testDrawMoney() {
		when(money.drawMoney(100.0, 20.0)).thenReturn(80.0);
		bank.UserSet(usr, money);
		Assert.assertEquals((double)bank.drawMoney(20.0),80.0);
	}

}
