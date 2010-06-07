/**
 * Copyright (C) 2009 SC 4ViewSoft SRL
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.achartengine.renderer;

import android.graphics.Color;
import android.graphics.Typeface;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract renderer to be extended by the multiple series classes.
 */
public class DefaultRenderer implements LabelsManager {
	/** The default background color. */
	public static final int BACKGROUND_COLOR = Color.BLACK;
	/** The default color for text. */
	public static final int TEXT_COLOR = Color.LTGRAY;
	/** A text font. */
	public static final Typeface TEXT_FONT = Typeface.create(Typeface.SERIF, Typeface.BOLD);
	/** A text font for regular text, like the chart labels. */
	public static final Typeface REGULAR_TEXT_FONT = Typeface.create(Typeface.SERIF, Typeface.NORMAL);
	/** The chart background color. */
	private int mBackgroundColor;
	/** If the background color is applied. */
	private boolean mApplyBackgroundColor;
	/** If the axes are visible. */
	protected boolean mShowAxes = true, mShowXAxis = true, mShowYAxis = true;
	/** The axes color. */
	protected int mAxesColor = TEXT_COLOR;
	/** If the labels are visible. */
	protected boolean mShowLabels = true;
	/** The labels color. */
	protected int mLabelsColor = TEXT_COLOR;
	/** If the legend is visible. */
	protected boolean mShowLegend = true;

	/** If the grid should be displayed. */
	protected boolean mShowGrid = false;
	protected boolean mShowGridHorizontal = false;
	protected boolean mShowGridVertical = false;






	/** The simple renderers that are included in this multiple series renderer. */
	private List<SimpleSeriesRenderer> mRenderers = new ArrayList<SimpleSeriesRenderer>();

	/**
	 * Adds a simple renderer to the multiple renderer.
	 * 
	 * @param renderer the renderer to be added
	 */
	public void addSeriesRenderer(SimpleSeriesRenderer renderer) {
		mRenderers.add(renderer);
	}

	/**
	 * Removes a simple renderer from the multiple renderer.
	 * 
	 * @param renderer the renderer to be removed
	 */
	public void removeSeriesRenderer(SimpleSeriesRenderer renderer) {
		mRenderers.remove(renderer);
	}

	/**
	 * Returns the simple renderer from the multiple renderer list.
	 * 
	 * @param index the index in the simple renderers list
	 * @return the simple renderer at the specified index
	 */
	public SimpleSeriesRenderer getSeriesRendererAt(int index) {
		return mRenderers.get(index);
	}

	/**
	 * Returns the simple renderers count in the multiple renderer list.
	 * 
	 * @return the simple renderers count
	 */
	public int getSeriesRendererCount() {
		return mRenderers.size();
	}

	/**
	 * Returns an array of the simple renderers in the multiple renderer list.
	 * 
	 * @return the simple renderers array
	 */
	public List<SimpleSeriesRenderer> getSeriesRenderers() {
		return mRenderers;
	}

	/**
	 * Returns the background color.
	 * 
	 * @return the background color
	 */
	public int getBackgroundColor() {
		return mBackgroundColor;
	}

	/**
	 * Sets the background color.
	 * 
	 * @param color the background color
	 */
	public void setBackgroundColor(int color) {
		mBackgroundColor = color;
	}

	/**
	 * Returns if the background color should be applied.
	 * 
	 * @return the apply flag for the background color.
	 */
	public boolean isApplyBackgroundColor() {
		return mApplyBackgroundColor;
	}

	/**
	 * Sets if the background color should be applied.
	 * 
	 * @param apply the apply flag for the background color
	 */
	public void setApplyBackgroundColor(boolean apply) {
		mApplyBackgroundColor = apply;
	}



	/**
	 * Returns if the legend should be visible.
	 * 
	 * @return the visibility flag for the legend
	 */
	public boolean isShowLegend() {
		return mShowLegend;
	}

	/**
	 * Sets if the legend should be visible.
	 * 
	 * @param showLegend the visibility flag for the legend
	 */
	public void setShowLegend(boolean showLegend) {
		mShowLegend = showLegend;
	}







	@Override
	public int getLabelsColor() {
		return mLabelsColor;
	}

	@Override
	public void setLabelsColor(int color) {
		mLabelsColor = color;
	}

	@Override
	public boolean isShowLabels() {
		return mShowLabels;
	}

	@Override
	public void setShowLabels(boolean showLabels) {
		mShowLabels = showLabels;
	}
}
