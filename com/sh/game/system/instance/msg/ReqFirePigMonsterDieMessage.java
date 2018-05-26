package com.sh.game.system.instance.msg;

import com.sh.net.kryo.KryoInput;
import com.sh.net.kryo.KryoOutput;
import com.sh.game.server.AbstractMessage;


/**
 * <p>通知烧猪小怪死亡</p>
 * <p>Created by MessageUtil</p>
 *
 * @author : admin
 */

public class ReqFirePigMonsterDieMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ReqFirePigMonsterDieMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 20037;
	}
	


	@Override
	public boolean read(KryoInput buf) {


		return true;
	}

	@Override
	public boolean write(KryoOutput buf) {


		return true;
	}
}
