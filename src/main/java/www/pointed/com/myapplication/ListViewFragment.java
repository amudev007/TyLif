package www.pointed.com.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import uk.co.ribot.easyadapter.EasyAdapter;

public class ListViewFragment extends Fragment {

  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View layout = inflater.inflate(R.layout.fragment_list_view, container, false);

    ListView listView = (ListView) layout.findViewById(R.id.list_view);
        /*
          Simply create an EasyAdapter by passing a Context and your ItemViewHolder implementation.
          Optionally, you can pass the list of items and a listener defined in the ItemViewHolder.
         */
    listView.setAdapter(new EasyAdapter<>(
            getActivity(),
            PersonViewHolder.class,
            DataProvider.getMockPeopleSet1(),
            mPersonHolderListener));

    return layout;
  }

  /**
   * A listener can be defined an set into the adapter so that it can be accessed from the PersonViewHolder.
   */
  private PersonViewHolder.PersonHolderListener mPersonHolderListener = new PersonViewHolder.PersonHolderListener() {
    @Override
    public void onPersonImageClicked(Person person) {
      new AlertDialog.Builder(getActivity())
              .setMessage(getString(R.string.my_name_string, person.getName()))
              .setPositiveButton(R.string.ok, null)
              .create()
              .show();
    }
  };

}
//TODO: this contains alerrt DIalouge