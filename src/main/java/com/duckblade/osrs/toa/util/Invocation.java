package com.duckblade.osrs.toa.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Invocation
{

	TRY_AGAIN(5),
	PERSISTENCE(10),
	SOFTCORE_RUN(15),
	HARDCORE_RUN(25),
	WALK_FOR_IT(10),
	JOG_FOR_IT(15),
	RUN_FOR_IT(20),
	SPRINT_FOR_IT(25),
	NEED_SOME_HELP(15),
	NEED_LESS_HELP(25),
	NO_HELP_NEEDED(40),
	WALK_THE_PATH(45),
	PATHSEEKER(15),
	PATHFINDER(25),
	PATHMASTER(40),
	QUIET_PRAYERS(20),
	SILENT_PRAYERS(35),
	ON_A_DIET(20),
	DEHYDRATION(30),
	OVERLY_DRAINING(15),
	LIVELY_LARVAE(10),
	MORE_OVERLORDS(10),
	BLOWING_MUD(10),
	MEDIC(15),
	AERIAL_ASSAULT(10),
	NOT_JUST_A_HEAD(15),
	ARTERIAL_SPRAY(5),
	BLOOD_THINNERS(10),
	UPSET_STOMACH(5),
	DOUBLE_TROUBLE(20),
	KEEP_BACK(10),
	STAY_VIGILANT(10),
	FEELING_SPECIAL(15),
	MIND_THE_GAP(10),
	GOTTA_HAVE_FAITH(10),
	JUNGLE_JAPES(5),
	SHAKING_THINGS_UP(10),
	BOULDERDASH(10),
	ANCIENT_HASTE(10),
	ACCELERATION(15),
	PENETRATION(10),
	OVERCLOCKED(15),
	OVERCLOCKED_2(15),
	INSANITY(50),
	;

	@Getter
	private final int raidLevel;

	public int getWidgetIx()
	{
		return ordinal() * 3;
	}

}
