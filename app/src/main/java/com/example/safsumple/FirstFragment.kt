package com.example.safsumple

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.safsumple.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    companion object {
        const val REQUEST_CODE_SAF = 41
    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            openSAF()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /**
     * Storage Access Frameworkを呼び出し、記録ファイルの保存先を選択する.
     * 保存先選択後、onActivityResultでUriを受け取り、openOutputStreamを使って書き込む.
     */
    private fun openSAF() {
        val intent = Intent(Intent.ACTION_CREATE_DOCUMENT).apply {
            type = "text/*"
            putExtra(
                Intent.EXTRA_TITLE,
                "sample.csv"
            )
        }
        startActivityForResult(intent, REQUEST_CODE_SAF)
    }

    /**
     * Listener for result from external activities. Receives text data dictation.
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK && data != null) {
            when (requestCode) {
                REQUEST_CODE_SAF -> {
                    val uri = data.data ?: return
                    // next output stream write todo..
                }
            }
        }
    }
}