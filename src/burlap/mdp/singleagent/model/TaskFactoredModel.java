package burlap.mdp.singleagent.model;

import burlap.mdp.core.TerminalFunction;
import burlap.mdp.singleagent.RewardFunction;

/**
 * @author James MacGlashan.
 */
public interface TaskFactoredModel extends SampleModel{
	void useRewardFunction(RewardFunction rf);
	void useTerminalFunction(TerminalFunction tf);
	RewardFunction rewardFunction();
	TerminalFunction terminalFunction();
}