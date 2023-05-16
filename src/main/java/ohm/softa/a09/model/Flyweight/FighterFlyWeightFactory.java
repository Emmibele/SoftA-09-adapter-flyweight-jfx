package ohm.softa.a09.model.Flyweight;

import ohm.softa.a09.resource.FxImageLoaderAdapter;

import java.util.HashMap;
import java.util.Map;

public class FighterFlyWeightFactory {
	private Map<String, FighterFlyWeight> fighterFlyWeights = new HashMap<>();
	FxImageLoaderAdapter loaderAdapter = new FxImageLoaderAdapter();

	public FighterFlyWeight getFighterFlyWeight(String path){
		if(fighterFlyWeights.containsKey(path))
			return fighterFlyWeights.get(path);

		var ffw = new FighterFlyWeight(path, loaderAdapter);
		fighterFlyWeights.put(path, ffw);

		return ffw;
	}

}
