package ohm.softa.a09.model.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FighterFlyWeightFactory {
	private Map<String, FighterFlyWeight> fighterFlyWeights = new HashMap<>();

	public FighterFlyWeight getFighterFlyWeight(String path){
		if(fighterFlyWeights.containsKey(path))
			return fighterFlyWeights.get(path);

		var ffw = new FighterFlyWeight(path);
		fighterFlyWeights.put(path, ffw);

		return ffw;
	}

}
