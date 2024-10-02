import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}

class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class Display implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature: " + temperature + "°C");
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Display display = new Display();
        station.addObserver(display);
        station.setTemperature(25);
    }
}