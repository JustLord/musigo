package by.sfsas.domain.entity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Playlist {

	@SerializedName("count")
	private int count;

	@SerializedName("items")
	private List<MusicItem> items;
}