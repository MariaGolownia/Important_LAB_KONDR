//Новогодний подарок (New Year gift). Определить иерархию конфет и про-
//чих сладостей. Создать несколько объектов-конфет. Собрать детский подарок
//с определением его веса. Провести сортировку конфет в подарке на основе
//одного из параметров. Найти конфету в подарке, соответствующую заданно-
//му диапазону параметров.

public class Candy {
	
private String name;
private int price;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Candy(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}

@Override
public String toString() {
	return "Candy [name=" + name + ", price=" + price + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Candy other = (Candy) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}



}
