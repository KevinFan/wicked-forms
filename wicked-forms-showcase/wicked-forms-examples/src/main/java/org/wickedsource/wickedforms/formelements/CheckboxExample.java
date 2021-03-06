package org.wickedsource.wickedforms.formelements;

import org.wickedsource.wickedforms.model.FormModel;
import org.wickedsource.wickedforms.model.SectionModel;
import org.wickedsource.wickedforms.model.elements.TextModel;
import org.wickedsource.wickedforms.model.elements.fields.CheckboxModel;

public class CheckboxExample extends FormModel {

	public CheckboxExample() {
		super("Checkbox Examples");

		add(new SectionModel("Simple Checkbox")
		    .add(new TextModel(
		        "A simple checkbox. Wow!"))
		    .add(new CheckboxModel("Subscribe Newsletter?")));

		add(new SectionModel("Selected Checkbox")
		    .add(new TextModel(
		        "A selected checkbox."))
		    .add(new CheckboxModel("Subscribe Newsletter?", true)));

		add(new SectionModel("Disabled Checkbox")
		    .add(new TextModel(
		        "Most form elements support the method setEnabled() to enable or disable them. "))
		    .add(new CheckboxModel("Did you read the terms and conditions?")
		        .setEnabled(false)
		        .setValue(true)));

	}

}
