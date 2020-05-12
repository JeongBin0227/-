function solution(n, edge){
    var head = 1;
    var q = [head];
    // 방문 여부
    var b = new Array(n+1);
    b[head] = true; 
    // 현 헤드와의 거리 저장
    var d = new Array(n+1);
    d[0] = null;
    d[head] = 0;   
     
    let j; 
    while(edge.length !== 0) {
        j = 0;
        while(j < edge.length) {
            if(edge[j].includes(head)) {
                edge[j] = edge[j].filter(k => k !== head);
                if(!b[edge[j][0]]) {
                    q.push(edge[j][0]); 
                    b[edge[j][0]] = true;
                    d[edge[j][0]] = d[head]+1;
                }
                edge.splice(j, 1);
				j--;
            }
            j++;
        }
		q.shift();
        head = q[0]; 
    }

    var max = Math.max(...d);

    return d.filter(i => i === max).length;
}