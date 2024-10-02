
class LegacySystem {
    public String oldMethod() {
        return "Legacy System: Performing old operation";
    }
}

interface NewSystem {
    String newMethod();
}

class Adapter implements NewSystem {
    private LegacySystem legacySystem;

    public Adapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public String newMethod() {
        return "Adapter: " + legacySystem.oldMethod();
    }
}

// Usage
class LegacySystemDemo {
    public static void main(String[] args) {
        LegacySystem legacy = new LegacySystem();
        NewSystem adapter = new Adapter(legacy);
        System.out.println(adapter.newMethod());
    }
}