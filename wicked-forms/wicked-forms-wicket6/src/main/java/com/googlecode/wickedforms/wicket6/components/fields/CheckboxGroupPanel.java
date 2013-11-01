/**
 *   Copyright 2013 Wicked Forms (http://wicked-forms.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.googlecode.wickedforms.wicket6.components.fields;

import java.util.Collection;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.CheckBoxMultipleChoice;
import org.apache.wicket.model.PropertyModel;

import com.googlecode.wickedforms.model.elements.fields.CheckboxGroupModel;
import com.googlecode.wickedforms.wicket6.components.WickedFormsChoiceRenderer;

/**
 * A panel that represents a {@link CheckboxGroupModel} in a form.
 * <p/>
 * <strong>Wicket IDs needed in the markup:</strong>
 * <ul>
 * <li><strong>label</strong>: a {@link Label} that displays the label of the
 * text field.
 * <li><strong>inputField</strong>: a {@link CheckBoxMultipleChoice} that takes
 * the user's input.
 * </ul>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class CheckboxGroupPanel<T> extends AbstractInputFieldPanel<List<T>> {

	private final CheckBoxMultipleChoice<T> checkgroup;

	public CheckboxGroupPanel(final String id, final CheckboxGroupModel<T> model) {
		super(id, model);

		this.checkgroup = new CheckBoxMultipleChoice<T>("inputField",
				new PropertyModel<Collection<T>>(model, "value"), model.getChoices());
		this.decorateComponent(this.checkgroup);
		this.checkgroup.setChoiceRenderer(WickedFormsChoiceRenderer.fromChoiceLabeller(model.getChoiceLabeller()));
		this.add(this.checkgroup);
	}

}