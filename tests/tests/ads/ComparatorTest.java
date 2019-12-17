package tests.ads;

import java.util.PriorityQueue;

import org.junit.Before;
import org.junit.Test;

import classes.ads.Paciente;
import classes.ads.PacienteComparator;
import classes.ads.RiscoEnum;
import org.junit.Assert;

public class ComparatorTest {

	private PriorityQueue<Paciente> queue;
	private Paciente p1, p2, p3, p4, p5, p6;

	@Before
	public void init() {
		this.queue = new PriorityQueue<Paciente>(6, new PacienteComparator());
		this.p1 = new Paciente("Pedro", RiscoEnum.Verde, 25);
		this.p2 = new Paciente("Gabriel", RiscoEnum.Amarelo, 22);
		this.p3 = new Paciente("Camila", RiscoEnum.Verde, 26);
		this.p4 = new Paciente("Juliana", RiscoEnum.Vermelho, 23);
		this.p5 = new Paciente("Carlos", RiscoEnum.Vermelho, 45);
		this.p6 = new Paciente("Fabiana", RiscoEnum.Amarelo, 53);
	}

	@Test
	public void assertRedOverGreen() {
		this.queue.add(this.p1);
		this.queue.add(this.p4);
		Assert.assertTrue(this.queue.peek().equals(this.p4));
	}

	@Test
	public void assertRedOverYellow() {
		this.queue.add(this.p2);
		this.queue.add(this.p5);
		Assert.assertTrue(this.queue.peek().equals(this.p5));
	}

	@Test
	public void assertRedOverRed() {
		this.queue.add(this.p4);
		this.queue.add(this.p5);
		Assert.assertTrue(this.queue.peek().equals(this.p4));
	}

	@Test
	public void assertGreenOverRed() {
		this.queue.add(this.p4);
		this.queue.add(this.p1);
		Assert.assertTrue(this.queue.peek().equals(this.p4));
	}

	@Test
	public void assertGreenOverYellow() {
		this.queue.add(this.p6);
		this.queue.add(this.p3);
		Assert.assertTrue(this.queue.peek().equals(this.p6));
	}

	@Test
	public void assertGreenOverGreen() {
		this.queue.add(this.p1);
		this.queue.add(this.p3);
		Assert.assertTrue(this.queue.peek().equals(this.p1));
	}

	@Test
	public void assertYellowOverGreen() {
		this.queue.add(this.p1);
		this.queue.add(this.p2);
		Assert.assertTrue(this.queue.peek().equals(this.p2));
	}

	@Test
	public void assertYellowOverRed() {
		this.queue.add(this.p5);
		this.queue.add(this.p6);
		Assert.assertTrue(this.queue.peek().equals(this.p5));
	}

	@Test
	public void assertYellowOverYellow() {
		this.queue.add(this.p6);
		this.queue.add(this.p2);
		Assert.assertTrue(this.queue.peek().equals(this.p6));
	}
}
