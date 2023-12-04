package Act3;

public class Bag<T> {
    private T[] list;
    private int count;

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count < list.length) {
            list[count++] = obj;
        } else {
            throw new IsFull("La bolsa está llena");
        }
    }

    public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            return list;
        } else {
            throw new IsEmpty("La bolsa esta vacia");
        }
    }

    public T remove(T obj) throws ObjectNoExist {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                T removedObj = list[i];
                for (int j = i; j < count - 1; j++) {
                    list[j] = list[j + 1];
                }
                count--;
                return removedObj;
            }
        }
        throw new ObjectNoExist("El objeto no existe en la bolsa");
    }

    public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Contenido de la bolsa: ");
        for (int i = 0; i < count; i++) {
            result.append(list[i]);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}

class IsFull extends Exception {
    public IsFull(String message) {
        super(message);
    }
}

class IsEmpty extends Exception {
    public IsEmpty(String message) {
        super(message);
    }
}

class ObjectNoExist extends Exception {
    public ObjectNoExist(String message) {
        super(message);
    }
}