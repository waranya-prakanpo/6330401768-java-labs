'use client'

import { Tree } from 'primereact/tree';
import { useEffect, useState } from 'react';
import { NodeService } from './service/NodeService';

export default function Home() {
    const [nodes, setNodes] = useState<any[]>([]);

    useEffect(() => {
        NodeService.getTreeNodes().then((data: any) => setNodes(data));
    }, []);

    return (
        <main>
            <div className="card flex justify-content-center">
                <Tree value={nodes} className="w-full md:w-30rem" />
            </div>
        </main>
    );
}
