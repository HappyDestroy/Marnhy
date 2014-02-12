/*
 * R�alis� par Martin Cesbron et Nicolas Saboureau � l'IIA de Laval
 * 
 ****GoldRoomActivity****
 * Cette activity permet d'entrer dans la pi�ce "GoldRoom"
 *  Elle g�nere al�atoire un nombre de gold de 1 � 150.
 *  
 *  Permet de passer � une autre pi�ce
 * 
 */
package com.nigwa.marny;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;

/**
 * Activity de la salle au tr�sor
 * @author HappyDestroy
 *
 */
public class GoldRoomActivity extends SherlockActivity {
	private MediaPlayer sound_coins = null;
	
	private Hero myHero;
	private int nb_room;
	private int health_left;
	
	/**
	 * Methode � la cr�ation de l'activity
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_goldroom);

		//Ajout Son
		sound_coins = MediaPlayer.create(GoldRoomActivity.this, R.raw.coins);
		sound_coins.start();
		//TextViex infos recompense
		final TextView label_gold = (TextView) findViewById(
			R.id.gold_label_gold);
		
		//G�n�ration des golds trouv�s
		int myRandom = Tools.random(1,150);
		label_gold.setText("Vous venez de trouver " + myRandom + 
				" Golds !");
		
		
		myHero = (Hero) getIntent().getSerializableExtra("hero");
		
		//Ajout des golds aux h�ros
		myHero.setGold(myHero.getGold() + myRandom);
		Button btn_next = (Button) findViewById(R.id.goldroom_btn_next);
		
		//On r�cup�re les extras depuis l'intent
		nb_room = getIntent().getIntExtra("nb_room", 1);
		nb_room++;
		
		health_left = getIntent().getIntExtra("health_left", 1); 
		
		//Listener du click sur le bouto npour changer de salle
		btn_next.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				int myRandom = Tools.random(20);
				if(myRandom >= 0 && myRandom <= 14) {
					Intent intentMonsterRoom = new Intent(GoldRoomActivity.this,
							MonsterRoomActivity.class);
					
					intentMonsterRoom.putExtra("hero", myHero);
					intentMonsterRoom.putExtra("nb_room", nb_room);
					intentMonsterRoom.putExtra("health_left", health_left);
					
					startActivity(intentMonsterRoom);
				} else if(myRandom >= 15 && myRandom <= 18 ) {
					Intent intentGoldRoom = new Intent(GoldRoomActivity.this,
							GoldRoomActivity.class);
					
					intentGoldRoom.putExtra("hero", myHero);
					intentGoldRoom.putExtra("nb_room", nb_room);
					intentGoldRoom.putExtra("health_left", health_left);
					
					startActivity(intentGoldRoom);
				} else {
					Intent intentRestRoom = new Intent(GoldRoomActivity.this,
							RestRoomActivity.class);
					
					intentRestRoom.putExtra("hero", myHero);
					intentRestRoom.putExtra("nb_room", nb_room);
					intentRestRoom.putExtra("health_left", health_left);
					
					startActivity(intentRestRoom);
				}
			}
		});
	}


	/**
	 * Sur l'ev�nement du bouton "Back" (Pour le desactiver)
	 */
	@Override
	public void onBackPressed() {
		Toast.makeText(this, getApplication().getString(R.string.btn_back), 
				Toast.LENGTH_LONG).show();
		return;
	}
}
