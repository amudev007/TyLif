package www.pointed.com.myapplication;



import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.ribot.easyadapter.ItemViewHolder;
import uk.co.ribot.easyadapter.PositionInfo;
import uk.co.ribot.easyadapter.annotations.LayoutId;
import uk.co.ribot.easyadapter.annotations.ViewId;

/**
 * The extension of ItemViewHolder for the ListView of Person.
 */

//Annotate the class with the layout ID of the item.
@LayoutId(R.layout.person_item_layout)
public class PersonViewHolder extends ItemViewHolder<Person> {

  //Annotate every field with the ID of the view in the layout.
  //The views will automatically be assigned to the fields.
  @ViewId(R.id.image_view_person)
  ImageView imageViewPerson;

  @ViewId(R.id.text_view_name)
  TextView textViewName;

  @ViewId(R.id.text_view_phone)
  TextView textViewPhone;

  //Extend ItemViewHolder and call super(view)
  public PersonViewHolder(View view) {
    super(view);
  }

  //Override onSetValues() to set the values of the items in the views.
  @Override
  public void onSetValues(Person person, PositionInfo positionInfo) {
    imageViewPerson.setImageResource(person.getResDrawableId());
    textViewName.setText(person.getName());
    textViewPhone.setText(person.getPhoneNumber());
  }

  //Optionally override onSetListeners to add listeners to the views.
  @Override
  public void onSetListeners() {
    imageViewPerson.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        PersonHolderListener listener = getListener(PersonHolderListener.class);
        if (listener != null) {
          listener.onPersonImageClicked(getItem());
        }
      }
    });
  }

  public interface PersonHolderListener {
    void onPersonImageClicked(Person person);
  }
}