import java.util.HashMap;

//FlyweightFactory
public class ColorFactory {
    // CacheFlyweight

    private static HashMap _colorMap = new HashMap();

    // getFlyweight(repeatingState)
    public static Color getColor(String nome) /* int R, int G, int B) */ {
        if (_colorMap.containsKey(nome) == false) {
            switch (nome) {
                case "red":
                    _colorMap.put(nome, new Color(nome, 255, 0, 0));
                    break;
                case "green":
                    _colorMap.put(nome, new Color(nome, 0, 255, 0));
                    break;
                case "blue":
                    _colorMap.put(nome, new Color(nome, 0, 0, 255));
                    break;
                case "white":
                    _colorMap.put(nome, new Color(nome, 255, 255, 255));
                    break;
                case "black":
                    _colorMap.put(nome, new Color(nome, 0, 0, 0));
                    break;

            }

        }
        return (Color) _colorMap.get(nome);

    }

}
