package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class Rock implements GameType {
    @Override
    public String eval(Integer opponentChoice) {
        if (opponentChoice== R.id.btnScissors||opponentChoice== R.id.btnLizard){
            return GameUtils.BEATS;
        }else if (opponentChoice==R.id.btnPaper||opponentChoice== R.id.btnSpock){
            return GameUtils.LOSES_TO;
        }
        else{
            return GameUtils.TIES;
        }
        /*rock loses to paper and spock*/
        /*rock beats scissors and lizard*/
    }
}
