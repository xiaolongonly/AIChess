�}� 	 �6  ����\K�]	0��63�`���߮??�|TLy�F�4,B=���9�\!�)`�Dʿ����{<i�.��'5]M��g�[��)R�l^�`2�����샗s����>%ڎד/�,N�h~��T��v�#�,��ˬ�������A<{��������ԟ.�U�}����8�E�����k[��:����m"�������U�+��T��w�gs��g���Cu��qξ���D3��]��:�(��:�es��&���~�ݣ���`xNb�#(�+-�����Z�1��/(0(��$�B,��#N�ɚ$[��"� G�7_��I�BF0�ӀC�군��y��q
`i~S���I�L0����B��*$[��o��{�Ѷ3�q��ECA�&Z�#d	�jLa�+��0mO�cn��ݰy�����|o��#����X�b�;��}�I���%Ɗ��A�����=h��j��X��T*JCN�e���hfp���L�߂ implements Runnable {
		public void run() {
			Intent intent = new Intent();
			intent.setClass(StartActivity.this, MainActivity.class);
			startActivity(intent);
			StartActivity.this.finish();
		}
	}

}
