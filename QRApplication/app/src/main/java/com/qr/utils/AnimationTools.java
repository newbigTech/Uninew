package com.qr.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

public class AnimationTools {

	/**
	 * ���Ŷ���
	 * 
	 * @param view
	 */
	public static void StartSetAnimation(View view,float fromX, float toX, float fromY, float toY) {
		AnimationSet animationSet = new AnimationSet(true);
		/*
		 * �������ͣ� ��һ��������X��ˮƽ������ʼλ�õĴ�С��fromX����1����������С
		 * �ڶ���������X��ˮƽ��������֮��toX���Ĵ�С��0������ȫ��ʧ�� ������������Y�ᴹֱ������ʼʱ�Ĵ�С��fromY��
		 * ���ĸ�������Y�ᴹֱ���Ž�����Ĵ�С��toY�� �����������pivotXTypeΪ������X����������λ������
		 * ������������pivotXValueΪ��������������X����Ŀ�ʼλ�� ���߸�������pivotXTypeΪ������Y����������λ������
		 * �ڰ˸�������pivotYValueΪ��������������Y����Ŀ�ʼλ��
		 * 
		 * ��������������������������������߸�����,�ڰ˸�������������ָ�����ŵ����ĵ� 0.5f�������������
		 */
//		ScaleAnimation scaleAnimation = new ScaleAnimation(1, 0.5f, 1, 0.5f,
//				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
//				0.5f);
		ScaleAnimation scaleAnimation = new ScaleAnimation(fromX, toX, fromY, toY,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		// 3����ɶ���
		scaleAnimation.setDuration(300);
		// ��AlphaAnimation����Ѿ����úõĶ�����ӵ� AnimationSet��
		animationSet.addAnimation(scaleAnimation);
		// ��������
		view.startAnimation(animationSet);
	}
}
