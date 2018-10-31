<?php 
	//冒泡排序
	function bubuulesort($arr)
	{
		$len = count($arr);
		if($arr<=1)
		{
			return $arr;
		}
		for($i = 0; $i < $len; $i++)
		{
			for($j = $len-1; $j > $i; $j--)
			{
				if($arr[$j]<$arr[$j-1])
				{
					$tmp = $arr[$j];
					$arr[$j] = $arr[$j-1];
					$arr[$j - 1] = $tmp;
				}
			}
		}
		return $arr;
	}
	$arr = array(4,2,6,8,3,1);
	// bubuulesort($arr);
	echo implode(" ", bubuulesort($arr));
?>	