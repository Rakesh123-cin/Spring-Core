package cm.rakesh.SpringCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{23+45}")
	private int x;
	
	@Value("#{5>3?'proceed':'stop'}")
	private String command;
	
	@Value("#{T(java.lang.Math).sqrt(45)}")
	private double y;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{5>7}")
	private boolean isOk;
	
	@Value("#{new String('Rakesh Anand')}")
	private String name;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", command=" + command + ", y=" + y + ", pi=" + pi + ", isOk=" + isOk + ", name=" + name
				+ "]";
	}
	
}
